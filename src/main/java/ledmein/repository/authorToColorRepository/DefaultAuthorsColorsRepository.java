package ledmein.repository.authorToColorRepository;

import ledmein.util.Lights;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.HashMap;

@Repository
public class DefaultAuthorsColorsRepository implements AuthorsColorsRepository {

    @NonNull
    private final HashMap<String, Color> authorsColors = new HashMap<>();

    @NonNull
    @Override
    public HashMap<String, Color> getAuthorsColors() {
        return authorsColors;
    }

    public Color getColorByAuthor(String author) {
        Color color = authorsColors.get(author);
        if(color == null){
            authorsColors.put(author, Lights.getRandomLight());
        }
        return authorsColors.get(author);
    }
}
