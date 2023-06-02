# Spring data e MongoDB

## Crud com Spring data e MongoDB
### Inserção, exclusão, consulta e atualizações de dados no banco de dados Mongo.

# Ferramentas utilizadas:

### Spring  para desenvolvimento do código Java.    --> (https://spring.io/tools)
### MongoDB community para armazenamento dos dados. --> (https://www.mongodb.com/try/download/community)
### Mongo compass para a manipulação dos dados.     --> (https://www.mongodb.com/try/download/compass)
### Postman para testar requisições.                --> (https://www.postman.com/downloads/)

## Passos importantes:

### Ao terminar de baixar o mongoDb crie uma variavél de ambiente no usuário do sistema no campo path. 
### Para isso insira o caminho da ferramenta atá a pasta bin no fim da variável path.

### Para startar o mongoDB no terminal basta abrir o cmd e digitar o comando a seguir e dar enter: mongod

### As inserções do banco poderão ser visualizadas na ferramenta mongo compass, assim como todas as operações relacionadas ao banco de dados.

### Dependências utilizadas:

#### Spring web
#### spring-boot-devtools
#### lombok
#### mongo

### Dependencia do mongo:

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
	</dependency>


#### Inserção via postman

Método: Post
body --> raw --> json

{
    "nome": "João Alvez",
    "idade": 30,
    "salario": 2500,
    "supervisor": {
        "codigo": "6478f2fcbd3fc303197239d5"
    }
   
}