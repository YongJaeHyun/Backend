package egovframework.job.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="APPLY")
@Getter
@Builder
public class Apply {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long a_id;
	private String state;
	private Long j_num;
	private Long cr_num;

}
