package junit5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ServiceTest {


    Database databaseMock = mock(Database.class);

    @Test
    public void testQuery() {
        Mockito.when(databaseMock.isAvailable()).thenReturn(true);

        Service service = new Service(databaseMock);
        boolean check = service.query("* dfsfrom t");

        assertThat(check).isTrue();
    }

    @Test
    public void ensureMockitoShouldReturnTheConfiguredValue() {
        when(databaseMock.getUniqueId())
                .thenReturn(45);
        Service service = new Service(databaseMock);
        assertThat(service.toString()).isEqualTo("Using database with id: 45");
    }
}