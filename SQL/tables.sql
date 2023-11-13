CREATE TABLE
  aluno (
    ID serial NOT NULL,
    NOME character varying(255) NOT NULL,
    EMAIL character varying(255) NOT NULL,
    PRIMARY KEY (ID)
  );

CREATE TABLE
  professor (
    ID serial NOT NULL,
    NOME character varying(255) NOT NULL,
    EMAIL character varying(255) NOT NULL,
    PRIMARY KEY (ID)
  );

