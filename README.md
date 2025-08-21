🚀 Desafio POO - DIO

Este repositório contém a solução para o Desafio: Aprendendo na Prática Programação Orientada a Objetos da Digital Innovation One (DIO)
.

O objetivo principal é colocar em prática os pilares da Programação Orientada a Objetos (POO) em Java:

Abstração

Encapsulamento

Herança

Polimorfismo

📌 Estrutura do Projeto
src/
 └─ br/com/dio/desafio/
     ├─ Main.java
     └─ dominio/
         ├─ Bootcamp.java
         ├─ Conteudo.java
         ├─ Curso.java
         ├─ Dev.java
         └─ Mentoria.java


Conteudo → classe abstrata (base para Curso e Mentoria)

Curso → herda de Conteudo, calcula XP com base na carga horária

Mentoria → herda de Conteudo, calcula XP fixo + bônus

Bootcamp → agrega conteúdos e devs inscritos

Dev → inscreve em Bootcamps, progride e acumula XP

Main → classe de demonstração do funcionamento

🛠️ Tecnologias utilizadas

Java 11+

Git / GitHub

IDE (IntelliJ, Eclipse ou VSCode)

▶️ Como executar

No terminal, na raiz do projeto:

javac -d out $(find src -name "*.java")   # Linux / Mac
dir /s /b src\*.java > sources.txt && javac -d out @sources.txt   # Windows (cmd)
java -cp out br.com.dio.desafio.Main


Ou simplesmente rodar Main.java pela sua IDE.

📊 Exemplo de saída

Ao rodar o Main, você verá algo assim:

Conteúdos Inscritos Everton: [Curso{titulo='Curso Java', ...}, Curso{titulo='Curso JS', ...}, Mentoria{titulo='Mentoria de Java', ...}]
Conteúdos Concluídos Everton: [Curso{titulo='Curso Java', ...}, Curso{titulo='Curso JS', ...}]
XP Everton: 120.0
-----------
Conteúdos Inscritos Maria: [Curso{titulo='Curso Java', ...}, Curso{titulo='Curso JS', ...}, Mentoria{titulo='Mentoria de Java', ...}]
Conteúdos Concluídos Maria: [Curso{titulo='Curso Java', ...}]
XP Maria: 80.0

🧩 Pilares de POO aplicados

Abstração → Conteudo é uma abstração de algo que gera XP.

Encapsulamento → atributos privados com getters/setters nas classes.

Herança → Curso e Mentoria estendem Conteudo.

Polimorfismo → calcularXp() se comporta diferente em Curso e Mentoria, mesmo sendo chamado de forma genérica.

✨ Autor

Projeto desenvolvido por Everton Reinaldo no bootcamp da Digital Innovation One
.