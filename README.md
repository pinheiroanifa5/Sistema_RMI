# Sistema_RMI
Sistema RMI em que um cliente possa enviar uma mensagem para um servidor, e o servidor deve armazenar a mensagem em um registro e responder com o número total de mensagens armazenadas até o momento. O RMI Registry é um servidor de registro  permitindo que os clientes localizem e se conectem a esses objetos por meio de um nome simbólico.
RMI, a interface é usada para definir os métodos que serão chamados remotamente pelo cliente. Mas, para que o servidor possa atender as solicitações do cliente, ele precisa implementar  interface em uma classe.
O codigo do cliente(RMIclient) obtem um referencia para o serviço do RMI em seguida, ele chama o método enviarMensagem() no serviço e exibe a resposta recebida.
Para executar esse código, tive que configurar o RMI e iniciar o servidor antes de executar o cliente. O cliente deve se comunicar com o servidor RMI e imprimir a mensagem "Mensagem recebida: Olá, servidor!" no console.

