package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderSelect_table")
@Data
public class OrderSelect {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
