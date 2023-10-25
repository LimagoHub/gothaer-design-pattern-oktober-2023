package de.gothaer.gui.presenter;

import de.gothaer.gui.IEuro2DollarRechnerView;
import de.gothaer.model.IEuro2DollarRechner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class Euro2DollarPresenterTest {

    @InjectMocks
    private Euro2DollarPresenter objectUnderTest;

    @Mock
    private IEuro2DollarRechner rechnerMock;

    @Mock
    private IEuro2DollarRechnerView viewMock;

    @Test
    //@DisplayName("Bla bla")
    void onBeenden_happyDay_success() {
        objectUnderTest.onBeenden();
        Mockito.verify(viewMock).close();
    }

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        assertEquals(expected, input);
    }
    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("not blank", false)
        );
    }
}