package Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data //is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private String isbn;
    private String author;
    private String title;
    private String editor;
    private int edition;
}
