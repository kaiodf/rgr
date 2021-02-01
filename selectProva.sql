--Como usuário, quando seleciono "Cidades" quero ver a lista de cidades
select * fron Cidade;

--Como usuário, quando seleciono uma cidade quero ver a lista de filmes.
select F.* from Filmes as F 
inner join Cidade_has_filme as CF on CF.Filme_idFilme = F.idFilme and
inner join Cidade as C on C.idFilme = CF.Cidade_idCidade
where c.descCidade = 'São Paulo';

--Como usuário, quando seleciono um filme quero ver a lista de cinemas.
select C.* from Cinema as C 
inner join Filme_has_cinema as FC on FC.Cinema_idCinema = C.idCinema and
inner join Filme as F on F.idFilme = FC.Filme_idFilme
where F.DescFilme = '007';

--Como usuário, quando seleciono um cinema quero ver a lista de horários.
select H.* from Horario as H 
inner join Cinema_has_Horario as CH on CH.Horario_idHorario = H.idHorario and 
inner join Cinema as C on C.idCinema = CF.Cinema_idCinema
where C.DescCinema = 'CINEMARK';

--Como usuário, quando seleciono um horário e informo o número de assentos quero ver os assentos disponíveis.
select A.* from Assento as A 
inner join Ingresso as I on I.Assento_idAssento = A.idAssento and 
inner join Compra as C on C.idCompra = I.Compra_idCompra and 
inner join Horario_has_Assento as HA on HA.Assento_idAssento = A.idAssento and 
inner join Horario as H on H.idHorario = HA.Horario_idHorario
where H.HorarioFilme = '22:00';


--Como usuário, quando seleciono o(s) assento(s) quero ver o preço total.
select C.valorCompra from Compra as C 
inner join Ingresso as I on I.Compra_idCompra = C.idCompra and
inner join Assento as A on A.idAssento = I.Assento_idAssento
where A.DescAssento in ('1A','1B');

--Como usuário, quando seleciono "Concluir Compra" quero ser redirecionado a um gateway de pagamento.
select * from Gateway as G 
inner join Compras as C on C.Gateway_idGateway = G.idGateway and 
where C.concluir = 1;

--Como usuário, quando realizo o pagamento quero receber o(s) ingresso(s) por e-mail.
select U.email from Usuario U 
inner join Compra as C on C.Usuariou_idusuario = U.idUsuario
where C.pago = 1;