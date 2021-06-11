-- DATOS BBDD ADJ CARS - PROYECTO INTEGRADOR--
********************************************************************************************************
		
	-- CREACIÓN DE TABLAS
		CREATE TABLE CONC_VEHICULOS (
			ID_VEHICULO INTEGER CONSTRAINT VEH_ID_PK PRIMARY KEY AUTOINCREMENT,
			MATRICULA VARCHAR2(7) CONSTRAINT UQ_CONC_VEH_MATR UNIQUE,
			NUM_BASTIDOR VARCHAR2(8) CONSTRAINT UQ_CONC_VEH_NUM_BAST UNIQUE,
			MARCA VARCHAR2(30) CONSTRAINT NN_CONC_VEH_MARCA NOT NULL,
			MODELO VARCHAR2 (50) CONSTRAINT NN_CONC_VEH_MODELO NOT NULL,
			TIPO_MOTOR VARCHAR2(30) CONSTRAINT NN_CONC_VEH_TIPO_MOTOR NOT NULL,
			FECHA_FAB VARCHAR2(10) CONSTRAINT NN_CONC_VEH_FEC_FAB NOT NULL,
			TIPO_VEH VARCHAR2 (50) CONSTRAINT NN_CONC_VEH_TIPO_VEH NOT NULL,
			COLOR VARCHAR2 (50) CONSTRAINT NN_CONC_VEH_COLOR NOT NULL,
			POTENCIA NUMBER(6) CONSTRAINT NN_CONC_VEH_POTENCIA NOT NULL
		);

		CREATE TABLE CONC_EMPLE (
			ID_EMPLE INTEGER CONSTRAINT EMP_ID_PK PRIMARY KEY AUTOINCREMENT,
			PSWD_EMPLE VARCHAR2(6) CONSTRAINT UQ_CONC_EMP_PSWD_EMPLE UNIQUE,
			NOMBRE VARCHAR2(30) CONSTRAINT NN_CONC_EMP_NOMB NOT NULL,
			DIRECCION VARCHAR2 (70) CONSTRAINT NN_CONC_EMP_DIREC NOT NULL,
			TELEFONO VARCHAR2 (12) CONSTRAINT NN_CONC_EMP_TEL NOT NULL,
			CARGO VARCHAR2(50) CONSTRAINT NN_CONC_EMP_CARGO NOT NULL
		);

		CREATE TABLE CONC_CLIENTES (
			ID_CLI INTEGER CONSTRAINT CLI_ID_PK PRIMARY KEY AUTOINCREMENT,
			PSWD_CLI VARCHAR2(6) CONSTRAINT UQ_CONC_CLI_PSWD_CLI UNIQUE,
			NOMBRE VARCHAR2(30) CONSTRAINT NN_CONC_CLI_NOMB NOT NULL,
			EMAIL VARCHAR2(50) CONSTRAINT UQ_CONC_CLI_EMAIL UNIQUE,
			TELEFONO VARCHAR2 (12) CONSTRAINT NN_CONC_CLI_TEL NOT NULL,
			FECHA_ALTA VARCHAR2(10) CONSTRAINT NN_CONC_CLI_FEC_ALTA NOT NULL
		);

		CREATE TABLE CONC_PRESUPUESTOS (
			ID_VEHICULO NUMBER(9),
			ID_CLI NUMBER(4),
			NUM_PPTO INTEGER CONSTRAINT UQ_CONC_PPTO_NUM_PPTO UNIQUE,
			PRECIO NUMBER(6) CONSTRAINT NN_CONC_PPTO_PRECIO NOT NULL,
			CONSTRAINT VEH_ID_VEH_ID_CLI_PK PRIMARY KEY (ID_VEHICULO, ID_CLI),
			CONSTRAINT VEH_ID_VEH_FK FOREIGN KEY (ID_VEHICULO) REFERENCES CONC_VEHICULOS (ID_VEHICULO),
			CONSTRAINT CLI_ID_CLI_FK FOREIGN KEY (ID_CLI) REFERENCES CONC_CLIENTES (ID_CLI)
		);
********************************************************************************************************

	-- INSERTS -- 
		
	 -- INSERTS EMPLEADOS --
		
		BEGIN
		INSERT INTO CONC_EMPLE
		VALUES (NULL, 'MARCOF', 'MARCO FERNANDEZ', 'C/ OLMO, 12', '+34 569874125', 'COMERCIAL');
		INSERT INTO CONC_EMPLE
		VALUES (NULL, 'LUISLO','LUIS LÓPEZ', 'C/ MAYOR, 2', '+34 569874521', 'DIRECTOR');
		INSERT INTO CONC_EMPLE
		VALUES (NULL, 'MARIAM','MARIA MOLLA', 'C/ HUERTAS, 1', '+34 599874125', 'ADMINISTRATIVO');
		INSERT INTO CONC_EMPLE
		VALUES (NULL, 'MARTAS','MARTA SORIA', 'C/ GRAN VÍA, 21', '+34 569478125', 'CONTABLE');
		END;
	*****************************************************************************************************
	
	-- INSERTS CLIENTES --
	
		BEGIN
		INSERT INTO CONC_CLIENTES
		VALUES(NULL, 'ANDRES', 'ANDRES', 'ANDRES1@GMAIL.COM', '+34 612 777 000', '04/05/2018');
		INSERT INTO CONC_CLIENTES
		VALUES(NULL, 'PILAR', 'PILAR', 'PILAR1@GMAIL.COM', '+34 612 377 000', '06/06/2020');
		INSERT INTO CONC_CLIENTES
		VALUES(NULL, 'DIEGO1', 'DIEGO', 'DIEGO@GMAIL.COM', '+34 612 777 001', '01/10/2019');
		INSERT INTO CONC_CLIENTES
		VALUES(NULL, 'JULIA', 'JULIA', 'JULIA1@GMAIL.COM', '+34 632 777 000', '24/05/2021');
		INSERT INTO CONC_CLIENTES
		VALUES(NULL, 'JAVIER', 'JAVIER', 'JAVIER@GMAIL.COM', '+34 612 777 020', '14/02/2019');
		END;
	*****************************************************************************************************
	
	-- INSERTS VEHÍCULOS -- 	
		BEGIN
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0001JJA', 'VWP00001', 'VOLKSWAGEN', 'POLO', 'TSI', '01/02/2017', 'HATCHBACK', 'NEGRO', 90);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0152JAA', 'VWP00011', 'VOLKSWAGEN', 'POLO', 'TDI', '05/04/2015', 'HATCHBACK', 'BLANCO', 65);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0191KKL', 'VWP00111', 'VOLKSWAGEN', 'POLO', 'TDI', '24/11/2019', 'HATCHBACK', 'GRIS', 105);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1301GFT', 'VWG01111', 'VOLKSWAGEN', 'GOLF', 'TSI', '19/08/2013', 'HATCHBACK', 'NEGRO', 110);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1081KBZ', 'VWG11111', 'VOLKSWAGEN', 'GOLF', 'TDI', '25/05/2018', 'HATCHBACK', 'VERDE', 90);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1401HHR', 'VWS11111', 'VOLKSWAGEN', 'SCIROCCO', 'TSI', '15/06/2014', 'HATCHBACK', 'ROJO', 140);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2020KZZ', 'AA111111', 'AUDI', 'A1', 'TDI', '28/07/2020', 'HATCHBACK', 'AZUL', 90);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2181LPI', 'AA311111', 'AUDI', 'A3', 'TFSI', '22/01/2021', 'HATCHBACK', 'PLATA', 110);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '6201LGT', 'AARS0002', 'AUDI', 'RS6 AVANT', 'TFSI', '05/10/2020', 'FAMILIAR DEPORTIVO', 'NEGRO', 600);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1091LSG', 'SL000022', 'SEAT', 'LEON', 'TGI', '30/04/2021', 'HATCHBACK', 'NEGRO', 90);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '9311KJA', 'SA000222', 'SEAT', 'ATECA', 'TSI', '14/02/2019', 'SUV', 'NEGRO', 180);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1111JVZ', 'FF002222', 'FORD', 'FOCUS', 'ECOBOOST TSI', '09/09/2018', 'HATCHBACK', 'AZUL OSCURO', 180);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1401HBR', 'FK022222', 'FORD', 'KUGA', 'ECOBOOST TDI', '03/03/2014', 'SUV', 'BLANCO', 120);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '8112KFC', 'FFRS2222', 'FORD', 'FOCUS RS', 'ECOBOOST TSI', '10/12/2019', 'HATCHBACK DEPORTIVO', 'AZUL CLARO', 300);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0101JSQ', 'PG300822', 'PEUGEOT', '3008', 'TDI', '21/08/2018', 'SUV', 'VERDE', 145);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2202HBP', 'PG208222', 'PEUGEOT', '208', 'TGI', '13/05/2015', 'HATCHBACK', 'NARANJA', 85);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '8721GJT', 'RC000003', 'RENAULT', 'CAPTUR', 'TDI', '22/04/2013', 'SUV', 'NARANJA', 95);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0311KVV', 'RM000033', 'RENAULT', 'MEGANE', 'TSI', '03/11/2019', 'HATCHBACK', 'ROJO', 130);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2809BCP', 'CP000333', 'CITROEN', 'PICASO', 'TDI', '28/09/2002', 'FAMILIAR', 'NEGRO', 180);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1706JNK', 'NJ003333', 'NISSAN', 'JUKE', 'TSI', '17/06/2016', 'SUV', 'ROSA', 75);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0212GDL', 'LD033333', 'LANCIA', 'DELTA', 'TDI', '02/12/2009', 'FAMILIAR', 'DORADO', 180);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '0503AHA', 'HA333333', 'HYUNDAI', 'ATOS', 'TSI', '05/03/2001', 'COMPACTO', 'AMARILLO', 60);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2407GVV', 'CA333333', 'CHEVROLET', 'AVEO', 'TSI', '24/07/2011', 'COMPACTO', 'AZUL', 60);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '2711KZM', 'ME333333', 'MERCEDES', 'CLASE E', 'TDI', '27/11/2019', 'BERLINA', 'GRIS', 180);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '3105LBF', 'BMWM4004', 'BMW', 'M4', 'TSI', '31/05/2020', 'DEPORTIVO', 'NEGRO', 431);
			INSERT INTO CONC_VEHICULOS
			VALUES (NULL, '1310KUI', 'BMWX5044', 'BMW', 'X5', 'TSI', '13/10/2019', 'TODOTERRENO', 'GRIS', 190);
		END;
********************************************************************************************************