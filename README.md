# 🎮 App Jokenpo Mobile

Um aplicativo Android simples e divertido desenvolvido em **Java + XML** no **Android Studio**, simulando o clássico jogo **Pedra, Papel e Tesoura (Jokenpo)**.  
Projeto criado como parte dos estudos de **desenvolvimento mobile nativo** e personalização de interfaces Android.

---

## 🧠 Sobre o Projeto

O **Jokenpo Mobile** é um app educacional voltado para o aprendizado de:

- Estrutura básica de um projeto Android (Activities, Layouts e Drawables)
- Manipulação de imagens e componentes de interface
- Interação via eventos de clique (`onClick`)
- Lógica de programação (condicionais, aleatoriedade)
- Uso de `Random` para gerar jogadas automáticas do app

---

## 🛠️ Tecnologias Utilizadas

| Categoria | Ferramenta |
|------------|-------------|
| IDE | Android Studio |
| Linguagem | Java |
| Layouts | XML |
| Versão mínima Android | API 21 (Android 5.0 Lollipop) |
| Estrutura de UI | ConstraintLayout / LinearLayout |
| Recursos gráficos | Drawable Resources |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/appjokenpo/
 │         └── MainActivity.java
 ├── res/
 │    ├── layout/
 │    │     └── activity_main.xml
 │    ├── drawable/
 │    │     ├── pedra.png
 │    │     ├── papel.png
 │    │     ├── tesoura.png
 │    │     └── padrao.png
 │    └── values/
 │          └── strings.xml
 └── AndroidManifest.xml
```

---

## 🧩 Lógica do Jogo

A classe `MainActivity` controla toda a lógica do jogo:

1. O jogador seleciona **Pedra**, **Papel** ou **Tesoura**.
2. O aplicativo escolhe aleatoriamente uma das três opções.
3. O resultado é exibido na tela através de um `TextView` e uma `ImageView`.

```java
String opcoes[] = {"pedra", "papel", "tesoura"};
String opcaoApp = opcoes[new Random().nextInt(3)];
```

As comparações determinam o resultado final:
- Jogador vence 🏆  
- App vence 💀  
- Empate 😐  

---

## 🧰 Estrutura XML

O layout principal (`activity_main.xml`) contém:
- 3 botões (Pedra, Papel, Tesoura)
- 1 `ImageView` (escolha do app)
- 1 `TextView` (resultado)
- 1 `TextView` opcional para placar

Exemplo de uso do atributo `onClick`:
```xml
<Button
    android:id="@+id/btnPedra"
    android:onClick="selecionadoPedra"
    android:text="Pedra"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

---

## 🏗️ Funcionalidades Implementadas

✅ Escolha entre Pedra, Papel e Tesoura  
✅ Resultado exibido na tela  
✅ Exibição da imagem correspondente à jogada  
✅ Lógica completa de vitória, derrota e empate  
✅ Código limpo e comentado  

---

## 📚 Licença

Este projeto foi desenvolvido para fins **educacionais**.  
Você pode modificar, reutilizar e distribuir livremente o código, mantendo os devidos créditos.

---

## 🚀 Let's Code!  
> "A melhor forma de aprender é construindo. Então... bora codar!"
