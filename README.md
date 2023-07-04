<div>
    <h1 align="center">API-REST para Logística</h1>
    <h6 align="center">End-Point para Controle de Entregas</h6>
</div>
<br><br>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Temgi/GestaoFornecedores/blob/main/LICENSE) 

<p align="center">
<img src="https://img.shields.io/badge/STATUS-completo-blue?style=for-the-badge">
</p>

## 🧠 Sobre o Projeto
<p>A Aplicação é uma API-REST criada com SpringBoot, Oriunda da Semana do Mergulho Spring REST(MSR), evento organizado pela Algaworks. Essa API Foi Desenvolvida para o Controle de Entrega de Mercadorias em Logística.
Sendo Constituida de End-Points envolve o Processo de Pedidos com as Entidades Entrega, Cliente, Destinatário, Ocorrência e Status.</p> 

<a href="http://app-java.ddns.net:8082/clientes" target="_blank" rel="noopener">Link do Projeto para Acesso Online</a>

## 💻 Acesso ao End-Point Listar
<br>

![End-Point Listar](https://github.com/Temgi/APILogistica/blob/main/assets/API-EndPoint1.png)

## 🎨 Acesso ao End-Point Adicionar
<br>

![End-Point Adicionar](https://github.com/Temgi/APILogistica/blob/main/assets/API-EndPoint3.png)

## 👓 Organização de Pacotes
<br>

![Pacotes do Projeto](https://github.com/Temgi/APILogistica/blob/main/assets/PacotesProjeto.png)

## ⚙️ Features

- [x] Inclusão de Boletos
- [x] Botões para Manipulação de Registros
- [x] Componente de Messagem
- [x] Validação de Campos
- [x] Pesquisa de Boletos
- [x] Atualização de Status
- [x] Exclusão de Boletos
- [x] App Mobile Responsivo
- [x] Componente de Calendário
- [x] Modal de Exclusão

## 💡 Acesso ao End-Point Atualizar
<br>

![End-Point Atualizar](https://github.com/Temgi/APILogistica/blob/main/assets/API-EndPoint4.png)

## 🛰️ Acesso ao End-Point Remover
<br>

![End-Point Remover](https://github.com/Temgi/APILogistica/blob/main/assets/API-EndPoint5.png)

## 🎯 Estrutura de Classes
<br>

![Estrutura de Classes](https://github.com/Temgi/APILogistica/blob/main/assets/EstruturaClasses.png)

## 🚀 Tecnologias Utilizadas:
### Back-End
<ul>
        <li> Java 11</li>
        <li> Spring MVC</li>
        <li> Spring Data JPA</li>
        <li>Spring Boot Devtools</li>
        <li> Thymeleaf</li>
        <li> Maven</li>
        <li> Apache TomCat</li>
        <li> JPA-Hibernate</li>
        <li>Bean Validation</li>
        <li>MySQL</li>
</ul>

## 🔥 Modelo Entidade Relacionamento
<br>

![MER](https://github.com/Temgi/APILogistica/blob/main/assets/MER.png)

## 🏁 Como Executar o Projeto

### Instalações
1-Baixar e Instalar o Java-JDK no Link Abaixo:
<br>
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
<br><br>
2-Configurar Variáveis de Ambiente do Java-JDK Conforme Link Abaixo:
<br>
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java
<br><br>
3-Baixar e Instalar o MySQL Seguindo os Links Abaixo:
<br>
https://dev.mysql.com/downloads/windows/installer/8.0.html
<br>
https://www.alura.com.br/artigos/mysql-do-download-e-instalacao-ate-sua-primeira-tabela
<br><br>
4-Baixar e Instalar o Postman Seguindo os Links Abaixo:
<br>
https://www.postman.com/downloads/
<br>
https://www.alura.com.br/artigos/postman-como-instalar-dar-seus-primeiros-passos
<br><br>

### Configuração Banco de Dados
1-Script SQL para Criação do Banco de Dados
~~~sql
CREATE SCHEMA `algalog`;
~~~
<br>

2-Script SQL para Popular Tabela TITULO
~~~sql
INSERT INTO cliente(nome, email, fone)
VALUES('João da Silva', 'joaodasilva@email.com', '11-99955-3333');

INSERT INTO cliente(nome, email, fone)
VALUES('Maria Abadia', 'mariaabadia@email.com', '11-99888-4444');

~~~
<br>

### Execução e Deploy do Projeto


#### Clonar Repositório
- git clone https://github.com/Temgi/APILogistica.git

#### Executar o Projeto
- Baixar e Descompactar o Apache Maven apache-maven-3.8.4 no Unidade C:\
- Copiar o Endereço da Pasta [bin] no Caminho [C:\apache-maven-3.8.4\bin]
- Configurar as Variáveis de Ambiente para o Apache Maven apache-maven-3.8.4:

   Abra o Meu Computador no Windows(Win+E) / Botão Direito dentro de Meu Computador e Selecione [Propriedades] / Click
   no lado Esquerdo em [Configurações Avançadas de Sistema]  / Na Aba [Avançado], clique na Parte Inferior em [Variáveis
   de Ambiente]  / Em [Variáveis de Sistema] Click em [Novo] / No Campo [Nome da Variável] digite [MAVEN_HOME] / No
   Campo [Valor da Variável] digite [C:\apache-maven-3.8.4] e Click OK / Selecione na Lista o Item [PATH] e Click em
   [Editar] / Click em [Novo] digite [%MAVEN_HOME%\bin] / Click em OK - OK - OK. Abra o Executar no Windows com [Win+R]
   digite [cmd], no Prompt de Comando digite o comando [mvn -version]

- Acessar no Prompt de Comando o Caminho da Pasta [target] do Projeto [APILogistica]
- No Prompt Executar o Comando [java -jar AppLogistica.jar]
- Baixar o Collection Resources do Postman logo Abaixo:<br>
  https://github.com/Temgi/APILogistica/blob/main/assets/API%20-%20Externo(Nuvem).zip
- Abrir o Postman e Importar a Collection conforme Link Abaixo:<br>
  https://learning.postman.com/docs/getting-started/importing-and-exporting-data/


## 📝 **Autor**

<table>
<tr>
<td align="center"><a href="https://github.com/Temgi"><img style="border-radius: 10%;" src="https://avatars.githubusercontent.com/u/8334174?v=4" width="80px;" alt="Foto de Rui Temgi Saraiva Azevedo no GitHub"/></a><br /></td>
</tr>
</table>

Rui Azevedo
<br>
Contatos:  <a href="https://www.linkedin.com/in/devruiazevedo/">LinkedIn</a> - <a href="https://wa.me/5511971973505?text=Olá.%20Estou%20Entrando%20em%20Contato%20a%20partir%20do%20Portfólio%20no%20GitHub.">WhatsApp</a> - <a href="#"> ruisaraivasp@gmail.com</a>


