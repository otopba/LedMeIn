package ledmein.model.github;

import ledmein.model.EventType;
import lombok.Data;

public class RepoEvent extends GitHubEvent {

    public RepoEvent(long eventTime, EventType eventType, String author) {
        super(eventTime, eventType, author);
    }
}
