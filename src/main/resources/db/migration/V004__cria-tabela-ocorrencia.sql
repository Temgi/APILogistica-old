CREATE TABLE OCORRENCIA(
	ID BIGINT NOT NULL AUTO_INCREMENT,
	ENTREGA_ID BIGINT NOT NULL,
	DESCRICAO TEXT NOT NULL,
	DATA_REGISTRO DATETIME NOT NULL,
	
	PRIMARY KEY(ID)
	
);

ALTER TABLE OCORRENCIA ADD CONSTRAINT FK_OCORRENCIA_ENTREGA
FOREIGN KEY(ENTREGA_ID) REFERENCES ENTREGA(ID);