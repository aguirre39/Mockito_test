package mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class VolumeTest {
    // 1 - Crie um mock da classe AudioManager
    @Mock
    private AudioManager audioManager;
    // 2 - injete um mock da classe VolumeUtil
    @InjectMocks
    private VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        // Realiza a chamada do método maximizeVolume, que utiliza o mock criado na etapa 1.
      
        volumeUtil.maximizeVolume(100);

        // Verifica se o método setVolume foi chamado exatamente uma vez.
        verify(audioManager, times(1)).setVolume(100);
    }

}



   
