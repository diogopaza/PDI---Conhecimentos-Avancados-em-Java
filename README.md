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
</ul>
