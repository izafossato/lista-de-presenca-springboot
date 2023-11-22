# lista-de-presenca-springboot


### Descrição do Projeto:
  Nosso sistema é uma aplicação web que permite aos professores registrarem e consultarem a frequência dos alunos em arquivos csv de forma fácil, rápida e segura. O sistema utiliza uma rest API e spring boot para sincronizar os dados em um servidor central, garantindo a integridade, a confiabilidade e a disponibilidade das informações. 
  Considerando que o registro e a consulta da presença dos alunos às aulas é uma tarefa que demanda tempo, papel e espaço físico, propomos o desenvolvimento de um sistema de lista de presença de sala de aula, para automatizar e otimizar o processo de registro e consulta da frequência dos alunos, contribuindo para a qualidade do controle da frequência dos alunos e reduzindo possíveis erros e perda de dados.


### Desenvolvedores:
- Daniel Lucas de Mello Ferreira Natal RA: 202106428
- Izabele Caetano Fossato RA: 202105065

Se você tiver uma sugestão que possa melhorar isso, crie um fork do repositório e também uma solicitação de pull. Você também pode simplesmente abrir uma issue com a tag “aprimoramento”.

### Tecnologias Empregadas:
- Java
- Spring Framework
- Biblioteca Jakarta
- Biblioteca Lombok
- Banco de Dados H2

### Descrição da Arquitetura:
Para o design da estrutura lógica do projeto, utilizaremos duas classes principais: Aluno e IniciaChamada, que irão interagir entre elas para a aplicação do CRUD no Banco de dados, assim, alterando um campo de presença booleano para a determinada data na instância da classe IniciaChamada. Para a relação entre os módulos, separamos a aplicação em pacotes diferentes contendo suas próprias classes ou interfaces, sendo elas a AlunoController para gerenciar as operações relacionadas aos alunos, oferecendo endpoints para listar todos os alunos e adicionar novos alunos por meio de requisições HTTP GET e POST, respectivamente.  E também a Interface AlunoRepository, que é responsável por fornecer métodos para interação com o banco de dados, permitindo operações de persistência e recuperação de dados relacionados à entidade "Aluno" por meio da integração com o framework Spring Data JPA.

### Funcionalidade

### Documentação

### Inovação e Criatividade

### Contact

Daniel Ferreira Natal - daniellucasatibaia@gmail.com

Izabele Caetano Fossato - izafossato@gmail.com

Project Link: [https://github.com/izafossato/lista-de-presenca-springboot](https://github.com/izafossato/lista-de-presenca-springboot)

### Agradecimentos

- Professor José Matias Lemes Filho [matiasfilho81](https://github.com/matiasfilho81)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/izafossato/lista-de-presenca-springboot.svg?style=for-the-badge
[contributors-url]: https://github.com/izafossato/lista-de-presenca-springboot/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/izafossato/lista-de-presenca-springboot.svg?style=for-the-badge
[forks-url]: https://github.com/izafossato/lista-de-presenca-springboot/network/members
[stars-shield]: https://img.shields.io/github/stars/izafossato/lista-de-presenca-springboot.svg?style=for-the-badge
[stars-url]: https://github.com/izafossato/lista-de-presenca-springboot/stargazers
[issues-shield]: https://img.shields.io/github/issues/izafossato/lista-de-presenca-springboot.svg?style=for-the-badge
[issues-url]: https://github.com/izafossato/lista-de-presenca-springboot/issues
[license-shield]: https://img.shields.io/github/license/izafossato/lista-de-presenca-springboot.svg?style=for-the-badge
[license-url]: https://github.com/izafossato/lista-de-presenca-springboot/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com
