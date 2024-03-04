# Criptografia hash com Java e princípios da programação orientada a objetos
<sub>Hash cryptography with Java and Object-Oriented Programming Principles</sub> <br> <br>

## O que é criptografia hash?
<sub>What is hash cryptography?</sub> <br><br>
A criptografia hash é uma técnica que transforma dados em uma sequência de caracteres alfanuméricos de comprimento fixo, chamada de hash. Essa transformação é unidirecional, o que significa que é fácil calcular o hash a partir dos dados, mas é extremamente difícil ou impossível regenerar os dados originais a partir do hash. Os algoritmos de hash são amplamente utilizados para armazenar senhas de forma segura, verificar a integridade de dados e gerar chaves de identificação únicas. <br>

<sub>Hash cryptography is a technique that transforms data into a sequence of fixed-length alphanumeric characters, called a hash. This transformation is one-way, meaning it is easy to compute the hash from the data, but extremely difficult or impossible to regenerate the original data from the hash. Hash algorithms are widely used for securely storing passwords, verifying data integrity, and generating unique identification keys.</sub>

## Como isso é feito em Java?
<sub>How was this done in Java?</sub>

Através do `MessageDigest`. `MessageDigest` é uma classe em Java que fornece funcionalidades para calcular hashes de dados usando vários algoritmos de hash, como `SHA-256`, `MD5`, entre outros. Esses hashes são usados para verificar a integridade de dados, armazenar senhas de forma segura e gerar identificadores únicos. A aplicação do MessageDigest em Java permite que os desenvolvedores criem sistemas seguros e confiáveis que protegem os dados contra modificações não autorizadas. <br>

<sub>The `MessageDigest` is a class in Java that provides functionalities for computing hashes of data using various hash algorithms such as `SHA-256`, `MD5`, among others. These hashes are used to verify data integrity, securely store passwords, and generate unique identifiers. The application of MessageDigest in Java allows developers to create secure and reliable systems that protect data against unauthorized modifications.</sub>

## Princípios da OO aplicados
<sub>Object-Oriented Principles Applied</sub>

Durante essa prática foquei em aplicar princípios da OO, como exemplo o encapsulamento, visando sua respectiva segurança<br>
<sub>During this practice, I focused on applying object-oriented principles, such as encapsulation, aiming for its respective security.</sub>
