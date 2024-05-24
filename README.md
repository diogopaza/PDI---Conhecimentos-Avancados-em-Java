# PDI---Conhecimentos-Avancados-em-Java

<h3>1- Threads Java</h3> 
<p> Java já nasceu om a idéia de executar tarefas em paralelo. Executar tarefas em paralelo está relacionado com desempenho. A JVM (Java Virtual Machine) já nasceu com o uso d threads, na época (aprox 1995) isso foi um grande diferencial. Hoje em dia é algo muito comum e faz parte da maioria das plataformas de desenvolvimento e ambientes de execução. Dessa forma mesmo se você nunca usou Threads com Java, vocÊ já utiliza esse recurso da JVM automaticamente. </p>

<h3>Benefícios</h3>
<ul>
  <li>Compartilhamento de recursos</li>
  <li>Utilização de arquiteturas multiprocessadas</li>
  <li>Economia</li>
</ul>

<h3>Uso de Threads com Java</h3>
<ul>
  <li>Threads Java são gerenciadas pela JVM</li>
  <li></li>
</ul>

<p>Quando várias threads são executadas não é possível ter controle sobre a ordem de execução dos processos em paralelo como pode ser visto na implementação do programa TarefaBuscaTextual.</p> 

<h4>Sincronização de Threads</h4>
<p>E possivel sincronizar as Threads com o uso do <emph>synchronized(this) { } </emph>. Desta forma apenas uma Thread pode ter acesso ao código por vez. É importante entender que sera sincronizado o accesso aos métodos e blocos de codigo em relação a instância especifica do objeto. Diferentes instancias podem executar esses metodos e blocos de codigo simultaneamente, caso estejam trabalhando em objetos diferentes.</p>
<p>Também é possível fazer um bloqueio de forma explícita (pragramaticamente) com o uso da classe <emph>ReentrantLock</emph></p> conforme exemplo no projeto <emph>threads-banheiro</emph>.

<h3>Comando Threads</h3>
<ul>
    <li>start()</li>
    <li>sleep()</li>
    <li>setDaemon(true) == esse método faz a máquina virtual do Java terminar a execução quando não existirem mais Threads aguardando para serem notificadas. Uma Thread daemon só roda quando mais Threads principais estão em execução.</li>
    <li>setPriority(10) == é possível dar prioridade a uma Thread, porém não é possível afirmar com certeza se essa Thread será executada por primeiro. O nível de prioridade varia entre 1 e10, sendo 10 a prioridade mais alta.</li>
    <li>wait()</li>
    <li>notifyAll()</li>
</ul>

<h3>Exercicio ChatGPT</h3>
Exercício: Produtor-Consumidor

Implemente um programa em Java que simule o problema do produtor-consumidor usando threads e um buffer compartilhado. O programa deve ter um produtor que adiciona itens ao buffer e um consumidor que retira itens do buffer. O buffer deve ter uma capacidade máxima especificada pelo usuário. O programa deve garantir que o produtor aguarde quando o buffer estiver cheio e que o consumidor aguarde quando o buffer estiver vazio.

Requisitos:

O programa deve solicitar ao usuário a capacidade máxima do buffer.
Implemente duas classes, Produtor e Consumidor, ambas estendendo a classe Thread.
O Produtor deve adicionar itens ao buffer até que ele esteja cheio, após o qual ele deve esperar.
O Consumidor deve retirar itens do buffer até que ele esteja vazio, após o qual ele deve esperar.
Utilize métodos de sincronização, como wait() e notify(), para garantir que o produtor e o consumidor sejam sincronizados.
O programa deve funcionar corretamente, mesmo que múltiplos produtores e consumidores sejam adicionados.
Dica:

Use um array para representar o buffer compartilhado.
Utilize o método synchronized para garantir o acesso exclusivo ao buffer compartilhado.


<hr>

<h2>Service Discovery e registry</h2>
Decompor aplicacoes traz beneficios, mas tambem traz dificuldades. 
Service Discover é um serviço de descoberta. 
Para isso sera criado um microsservico chamado de Service-Discovery.
No pom.xml 
<spring-cloud.version>2023.0.1</spring-cloud.version>

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>

<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

 No application.properties
 eureka.client.register-with-eureka=false 
eureka.client.fetch-registry=false
#endereco para se autenticar no servidor eureka
eureka.client.serviceUrl.defaultZone=http://localhost:8081/eureka

-------------------------------------------------------------------

O proximo passo é o microsservico de pagamento se registrar no Service-Discovery:

Microsservicos Pagamentos ---

self registration, onde cada instância deverá se auto-registrar no servidor. É o que veremos no próximo vídeo,
onde usaremos o Eureka Client para que o microsserviço de pagamentos seja registrado e possa ser localizado pelo nome

pom.xml

<spring-cloud.version>2022.0.1</spring-cloud.version>

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>

<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

 application.properties === 

 #Configuracoes para se registrar no Eureka Service
spring.cloud.config.enabled=false
eureka.client.register-with-eureka=true 
eureka.client.fetch-registry=true
eureka.client.serviceUrl.defaultZone=http://localhost:8081/eureka

#O proprio Eureka defini em qual porta o microssrvico ira subir
server.port=0

-------------------------------------------


 





