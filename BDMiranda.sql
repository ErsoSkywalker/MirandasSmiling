/*
Base de datos Relacional :D

Dentista consultorio

Recepcionista
	Controla la BD
	Mete registro de citas
Dentista
	Nombre
	Edad
	Contacto

Pacientes
	Nombre PAciente
	Edad
	Observaciones

Citas
	DentistaAsignado
	PacienteAsignado
	Metodo de Pago
	Diagnostico

Metodo de Pago
	Efectivo
	Tarjeta
	Transferencia

TipoServicio
	Revisión
	Limpieza dental
	Blanqueamiento
	Porcelana

RelacionTiposServicioYCitas
	Cita
	TipoServicio

*/
drop database if exists dbDentista;
create database dbDentista;
use dbDentista;



create table tblTrabajador(

	idTrabajador int primary key not null,
    Nombre nvarchar(60) not null,
    Apellido nvarchar(60) not null,
    Edad int not null,
    Telefono nvarchar(60) not null,
    Mail nvarchar(60) not null,
    TipoTrabajador enum('Pediatra', 'General'),
    usuario nvarchar(60) not null,
    contrasena nvarchar(60) not null  
    
);

insert into tblTrabajador values (1,'Miranda','Salinas',80,'555555555','Mirandapepino@hotmail.com','Pediatra','admin',md5('admin'));

create table tblPaciente(

	idPaciente int primary key not null,
    Nombre nvarchar(60) not null,
    Apellido nvarchar(60) not null,
    Edad int not null,
    Telefono nvarchar(60) not null,
    Mail nvarchar(60) not null,
    Observaciones text not null
    
);

create table tblCita(

	idCita int primary key not null,
    idPaciente int not null,
    idTrabajador int not null,
    FechaCita date not null,
	MetodoDePago enum('Efectivo','Tarjeta de Credito'),
    Diagnostico text not null,
    Estatus enum('Pendiente', 'Confirmada','Ausente'),
    foreign key (idPaciente) references tblPaciente(idPaciente),
    foreign key (idTrabajador) references tblTrabajador(idTrabajador)
    
);

create table tblTipoServicio(

	idTipoServicio int primary key not null,
    TipoServicio nvarchar(60) not null,
    Costo float not null

);

create table tblRelCitasTipoServicio(

	idRelCitasTipoServicios int primary key not null,
    idCita int not null,
    idTipoServicio int not null,
    foreign key (idCita) references tblCita(idCita),
    foreign key (idTipoServicio) references tblTipoServicio(idTipoServicio)
    
);

#Procedimientos almacenados

drop procedure if exists spLogin;
delimiter //

	create procedure spLogin(in Usuarioxd nvarchar(60), in Contrasenaxd nvarchar(60))
    BEGIN
    
		declare idResultado int;
        set idResultado = ifnull((Select idTrabajador from tbltrabajador where usuario = Usuarioxd AND contrasena = md5(Contrasenaxd)),0);
    
		select idResultado;
    
    END //
	drop procedure if exists spAgregarTrabajador//
	create procedure spAgregarTrabajador(in Nombrexd nvarchar(60), in Apellidoxd nvarchar(60), in Edadxd int, in Telefonoxd nvarchar(60), in Mailxd nvarchar(60), in TipoTrabajadorxd nvarchar(60), in Usuarioxd nvarchar(60), in Contrasenaxd nvarchar(60))
    BEGIN
    
		declare idSiguiente int;
        set idSiguiente = ifnull((Select MAX(idTrabajador) from tbltrabajador)+1,1);
		IF((Select idTrabajador from tbltrabajador where usuario = Usuarioxd) is not null)
        THEN
        
			Select 0 as Mensaje;
        
        ELSE
			
            Insert into tblTrabajador values(idSiguiente, Nombrexd, Apellidoxd, Edadxd, Telefonoxd, Mailxd, TipoTrabajadorxd, Usuarioxd, Contrasenaxd);
            Select 1 as Mensaje;
        
        END IF;
		
    
    END //

	create procedure spDespliegaDentista()
    BEGIN
    
		Select concat(Nombre, ' ', Apellido) as Nombre from tbltrabajador;
    
    END //
    drop procedure if exists spAgregarCita//
    create procedure spAgregarCita(in NombrePacientexd nvarchar(60), in Apellidosxd nvarchar(60), in Edadxd int, in Fechaxd date, in idDentistaAsignado int, in Telefonoxd nvarchar(60), in Observacionesxd nvarchar(60), in MetodoDePagoxd nvarchar(60) )
    BEGIN
    
			declare idPacientexd int;
            declare idCitaxd int;
            set idCitaxd = ifnull((Select MAX(idCita) from tblcita)+1,1);
            set idPacientexd = (Select idPaciente from tblPaciente where Nombre = NombrePacientexd AND Apellido = Apellidosxd);
    
			IF(idPacientexd is null)
            THEN
            
				set idPacientexd = ifnull((Select MAX(idPaciente) from tblPaciente)+1,1);
                insert into tblPaciente values(idPacientexd, NombrePacientexd, Apellidosxd, Edadxd, Telefonoxd, '', '');
				insert into tblcita values(idCitaxd, idPacientexd, idDentistaAsignado, Fechaxd, MetodoDePagoxd, Observacionesxd, 'Pendiente');
            
            ELSE 
            
				insert into tblcita values(idCitaxd, idPacientexd, idDentistaAsignado, Fechaxd, MetodoDePagoxd, Observacionesxd, 'Pendiente');
            
            END IF;
			Select 1 as Mensaje;
    END //


	drop procedure if exists spDesplegarDiagnosticos//
	create procedure spDesplegarDiagnosticos(in NombrePacientexd nvarchar(60), in Apellidoxd nvarchar(60))
    BEGIN
		
        IF((Select idPaciente from tblpaciente where Nombre = NombrePacientexd AND Apellido = Apellidoxd) is not null)
        THEN
        
				Select Diagnostico from tblcita where idPaciente = (Select idPaciente from tblpaciente where Nombre = NombrePacientexd AND Apellido = Apellidoxd);
        
        ELSE
        
				Select -1 as Diagnostico;
        
        END IF;
        
		
    
    END //

delimiter ;
