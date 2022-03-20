# Atividade Sistema Bancário Java

### Implemente um sistema bancário. 

Você deverá criar uma classe Conta tendo como atributos o nome do titular, número e saldo e os métodos sacar e depositar. 

Agora, crie um programa principal que instancie uma Conta. O sistema
deve entrar em um laço de repetição exibindo as seguintes opções para o usuário: 

- Digite 1 para criar uma conta
- Digite 2 para ver o saldo de uma conta
- Digite 3 para sacar
- Digite 4 para depositar
- Digite qualquer outro número para sair do programa e finalizar


Caso o usuário digite 1, o sistema deve instanciar uma nova conta, solicitar o nome do titular e o saldo inicial atribuindo esses valores à conta criada. O número da conta deverá ser sequencial, atribuído pelo próprio programa. Então o programa exibirá o número da conta criada, adicionará a conta a um ArrayList e exibirá as opções novamente. 

Se o usuário digitar as opção 2, 3 ou 4, solicite o número da conta que o usuário deseja e localize essa conta na lista. Depois de localizar a conta, se a opção tiver sido a 2, o sistema apenas exibe uma mensagem informando o saldo da conta solicitada. 

Se for a opção 3, o sistema deve efetuar um saque na conta seguindo a regra que só pode realizar o saque se houver valor disponível. Assim, o sistema deve solicitar o valor a ser sacado, chamar o método sacar verificando o retorno. Se o retorno for true, exibir uma mensagem de saque efetuado com sucesso; caso contrário, uma mensagem de saque não efetuado e voltar a exibir as opções.

Se for a opção 4, o sistema deve solicitar o valor a ser depositado, chamar o método depositar, exibir o saldo atualizado e voltar a exibir as opções. 

Se for qualquer outro número, o sistema deve informar uma mensagem que a sessão foi finalizada. 
