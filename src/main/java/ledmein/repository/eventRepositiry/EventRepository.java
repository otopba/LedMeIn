package ledmein.repository.eventRepositiry;

import ledmein.model.Event;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository {

    @NonNull
    List<Event> getEvents(@NonNull String ownerUsername, @NonNull String repoName);
}