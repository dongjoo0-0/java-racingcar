package racing.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racing.core.ClientInput;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @BeforeEach
    void setOutStream() {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    void view를_통한_유효Dto_생성() {
        String carCountIn = "3";
        String tryCountIn = "5";
        String input = carCountIn + "\n" + tryCountIn;
        InputStream in1 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in1);

        InputView inputView = new InputView();
        ClientInput result = inputView.getClientInput();

        ClientInput expected = ClientInput.builder()
                .carCount(3)
                .tryCount(5)
                .build();
        assertThat(result).isEqualTo(expected);
    }
}