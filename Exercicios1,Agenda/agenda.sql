use agenda;

create table contato(
id int primary key,
nome varchar(50) not null,
email varchar(50) not null,
telefone int not null
);

create table Telefone(
telefonefixo int not null,
telefoneCelualr int not null
);

insert into contato (id,nome,email,telefone) values
   (12345,'lorenzo','lorezin22@gmail.com',123456789),
   (22222,'Laura','Lauraalmeida@gmail.com',987654321),
   (43432,'Almeida','Almeidabruna@gmail.com',135798642);
   

   
   
   commit;
   
   select * from contato;
   
   SELECT id FROM contato;
   
   ALTER TABLE contato ADD atualizaContato boolean;
   
   update contato Set atualizaContato= true;
   