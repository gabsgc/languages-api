<div align="center">
  <h1>API Linguagens de Programação</h1>
  <p>API desenvolvida durante a Imersão Java da Alura.🤿 ☕ <br>
  Desenvolvido com 💙 por Gabriela Garcia.</p>
</div>

## ⚙️ Funcionalidades 
- GET de linguagens
- POST de linguagens
- PATCH de linguagens (update parcial: altera imagem e ranking)
- DELETE de linguagens

## 🛠️ Tecnologias utilizadas
- Java 18
- Spring Framework
- MongoDb

## 🖥️ Endpoints
#### GET Linguagens e POST Linguagens
````
https://languages-api-java-immersion.herokuapp.com/languages
````
#### DELETE Linguagem e PATCH Linguagem
````
https://languages-api-java-immersion.herokuapp.com/languages/{id}
````
#### Exemplo de PATCH Linguagem
````
	{
		"image": "https://github.com/abrahamcalf/programming-languages-logos/blob/master/src/php/php.png?raw=true",
		"ranking": 8
	}
````
## 📒 Conteúdos da Imersão 
**Aulas 1, 2 e 3**: [Consumir API e exibir filmes e séries e criar um gerador de figurinhas](https://github.com/gabsgc/alura-stickers)

**Aula 4**: construir uma API REST para expor o nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

**Aula 5**: vamos tornar a nossa aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem. Além disso, vamos gerar figurinhas a partir do conteúdo dessa nossa API.

## 🎯 Desafios cumpridos
  - [X] Finalizar o CRUD (Create, Read, Update e Delete) para se poder atualizar e excluir uma linguagem cadastrada;
  - [X] Retornar o *status* 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
  - [X] Aplicar modificações parciais no recurso através do método PATCH.

## 📸 Screenshots
####  📌 Stickers de linguagens de programação enviadas no WhatsApp
<img src="https://github.com/gabsgc/languages-api/blob/master/.attachments/stickers-whatsapp.jpeg" alt="Stickers" width="50%">

## 🚀 Próximos passos - Desafios
- [ ] Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas;
- [ ] Devolver a listagem ordenada pelo ranking.

## ❔ Dúvidas?!
Se tiver alguma dúvida sobre este repositório, envie para gabriellagarccia@gmail.com
