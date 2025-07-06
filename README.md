# RecyclerView_Java
RecyclerView_Java
# 🎮 RecyclerView Jogos - App Android

![RecyclerView Jogos](https://user-images.githubusercontent.com/placeholder/image.png)

---

## 📋 Sobre o projeto

Este projeto Android demonstra o uso do **RecyclerView** para exibir uma lista personalizada de jogos, contendo nome, plataforma, preço formatado em Real (R$) e ícones representando cada plataforma.

Além disso, o app trata eventos de interação do usuário como:

- 👆 Clique simples: exibe um toast com o nome do jogo clicado.
- ✋ Clique longo: abre um diálogo de confirmação para "comprar" o jogo.

---

## ⚙️ Funcionalidades

- Lista customizada usando `RecyclerView.Adapter` e `ViewHolder`.
- Formatação monetária brasileira (R$) com separação de milhar e decimal.
- Ícones dinâmicos conforme a plataforma do jogo.
- Interface separada para cliques simples e longos para melhor organização do código.
- AlertDialog para confirmar compra no clique longo.
- Código simples, claro e modular para fácil aprendizado e personalização.

---

## 📂 Estrutura do Projeto

| Arquivo/Classe           | Função                                                        |
|-------------------------|---------------------------------------------------------------|
| `Jogo.java`             | Modelo de dados com nome, plataforma e preço do jogo.          |
| `JogoAdapter.java`      | Adapter que conecta a lista de jogos ao RecyclerView.          |
| `JogoViewHolder.java`   | Gerencia os elementos visuais de cada item do RecyclerView.    |
| `OnJogoClickListener.java`    | Interface para clique simples em itens.                        |
| `OnJogoLongClickListener.java`| Interface para clique longo em itens.                         |
| `MainActivity.java`     | Configura RecyclerView, cria lista e trata eventos de clique.  |
| `res/layout/jogo_linha.xml`    | Layout XML customizado para cada item da lista.             |
| `res/drawable/*.png`    | Ícones das plataformas (Xbox, PC, Nintendo, PlayStation).      |

---

## 🚀 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/seuprojeto.git
2.Abra o projeto no Android Studio.

3.Conecte um dispositivo Android ou configure um emulador.

4.Compile e execute o app.

## 💡 Como usar

- A lista de jogos já vem populada com títulos famosos.
- Toque em qualquer jogo para ver um toast com o nome.
- Segure o dedo sobre um jogo para abrir o diálogo de compra.
- Confirme para ver a mensagem de compra realizada.

---

## 🛠️ Tecnologias usadas

- Java 8
- Android SDK (API mínima recomendada: 21+)
- RecyclerView (AndroidX)
- AlertDialog para interações
- NumberFormat para formatação monetária (Locale pt-BR)

---

## 📖 Aprendizados e conceitos chave

- Criação e uso de modelos de dados (POJOs) em Java.
- Implementação de RecyclerView com Adapter e ViewHolder.
- Uso de interfaces para separar eventos de clique.
- Formatação de números e moedas localizados.
- Gerenciamento de eventos de clique simples e longo.
- Criação e exibição de AlertDialog.
- Boa prática de código modular e legível.

---

## 🤝 Contribuições

Contribuições são bem-vindas!  
Sinta-se à vontade para abrir issues ou pull requests.

---

## 📫 Contato

Matheus Martinelli  
✉️ martinelli.matheus2@gmail.com



---

## 🧡 Agradecimentos

Obrigado por visitar o projeto!  
Espero que ele ajude você a dominar RecyclerView no Android.  


Feito com ❤️ por Matheus Martinelli
