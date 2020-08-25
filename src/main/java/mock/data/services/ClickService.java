package mock.data.services;

import java.util.List;
import mock.data.models.Click;

public interface ClickService {
    List<Click> findAll();
}
