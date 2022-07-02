TELAS:
O app consiste em uma tela de Login, Add Dados e Visualiza-los.

FUNCIONALIDADE:
O app funciona de forma que vc realiza um login existente e em seguida, recebe seus dados (telefone e email) indo para a tela seguinte para mostra-los,
podendo altera-los novamente por meio do botao se desejável.

IMPORTANTE:
Tentei fazer de forma que primeiro houvesse a tela de que mostra dados e depois adiciona-los, e dessa forma,
usando a função onResume para iniciar a função de recuperação dos dados, entretanto toda vez q a função onResume era chamada o app crashava,
sem falar dos diversos travamentos e crashes ao emular o dispositivo, enfim MUITO BUGADO.
A forma que consegui foi inserir os dados primeiro e na tela seguinte mostra-los.

LOGIN:
user: flavio
senha: 123
