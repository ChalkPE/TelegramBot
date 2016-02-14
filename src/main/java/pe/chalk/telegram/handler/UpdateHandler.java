package pe.chalk.telegram.handler;

import pe.chalk.telegram.type.Update;

import java.util.List;

/**
 * @author ChalkPE <chalkpe@gmail.com>
 * @since 2016-02-02
 */
public interface UpdateHandler {
    void handleMessage(List<Update> updates);
}
