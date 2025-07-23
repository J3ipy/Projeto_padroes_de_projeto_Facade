# Home Theater Facade

Este projeto demonstra a implementação do padrão de projeto **Facade** para simplificar a interface de um sistema de home theater complexo.

## 🎯 Visão Geral

O padrão **Facade** fornece uma interface unificada para um conjunto de interfaces em um subsistema. Ele define uma interface de nível superior que torna o subsistema mais fácil de usar.  
Neste projeto, a classe `Facade` simplifica a interação com vários componentes de um home theater, como o projetor, o sistema de som, as luzes e muito mais.

## ✨ Funcionalidades

O `Facade` do home theater oferece métodos simples para as seguintes ações:

- **`watchMovie(String movieName, String audioTrack)`**:  
  Prepara e inicia a exibição de um filme. Isso inclui ligar a máquina de pipoca, diminuir as luzes, ligar o projetor e o sistema de som e reproduzir o filme e o áudio.

- **`endMovie()`**:  
  Finaliza a sessão do filme, desligando todos os componentes e restaurando as luzes.

- **`listenToMusic(String musicTrack)`**:  
  Configura o sistema para ouvir música, ajustando as luzes e o modo de áudio.

- **`endMusic()`**:  
  Para a reprodução de música e desliga os sistemas relevantes.

## 🧩 Componentes do Subsistema

A `Facade` gerencia os seguintes componentes do subsistema:

- `IAudioPlayer`: Controla a reprodução de áudio.
- `ILights`: Controla o nível de iluminação.
- `IPopcornMachine`: Controla a máquina de pipoca.
- `IProjector`: Controla o projetor.
- `ISoundSystem`: Gerencia o sistema de som.
- `ISubtitleService`: Gerencia as legendas.
- `ITheatreScreen`: Controla a tela de projeção.
- `IVideoPlayer`: Controla a reprodução de vídeo.

## 🚀 Como Usar

O ponto de entrada principal do projeto é a classe `App`. Para executar o projeto, compile e execute a classe `App`.

### Exemplo de uso (`App.java`):

```java
import com.cinetech.facade.Facade;
import com.cinetech.subsystem.components.*;
import com.cinetech.utils.Logger;

public class App {

    public static void main(String[] args) {
        Logger.info("Iniciando a montagem do sistema de Home Theater...");

        Facade homeTheater = new Facade.Builder()
                .withAudioPlayer(new DefaultAudioPlayer())
                .withLights(new DefaultLights())
                .withPopcornMachine(new DefaultPopcornMachine())
                .withProjector(new DefaultProjector())
                .withScreen(new DefaultTheatreScreen())
                .withSoundSystem(new DefaultSoundSystem())
                .withSubtitleService(new DefaultSubtitleService())
                .withVideoPlayer(new DefaultVideoPlayer())
                .build();
        
        Logger.info("Sistema montado. Iniciando operações.");
        
        homeTheater.watchMovie("Design Patterns: A Vingança do Código Limpo", "Trilha Sonora Refatorada");
        homeTheater.endMovie();

        System.out.println("\n------------------------------------------------\n");

        homeTheater.listenToMusic("The Sound of Silence (by Simon & Garfunkel)");
        homeTheater.endMusic();
    }
}
````

## 📁 Estrutura de Pastas

* `src`: Contém os arquivos de código-fonte Java.
* `bin`: Contém os arquivos de classe compilados.
* `lib`: Contém as bibliotecas de dependência.

---

> Projeto acadêmico demonstrando o uso do padrão **Facade** com Java.

