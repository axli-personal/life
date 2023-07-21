package cn.axlis.store;

import cn.axlis.entity.Sport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SportStoreTest {
    @Autowired
    private SportStore sportStore;

    @Test
    public void testInsertSport() {
        var sport = new Sport();

        sport.setName("游泳");
        sport.setDefaultUnit("米");

        sportStore.insert(sport);
    }
}
