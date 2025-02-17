package egovframework.job.dto;

import egovframework.job.vo.ResumeRegionVO;
import egovframework.job.vo.ResumeVO;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class ResumeRegionDTO {
	private long region_id;
	private long r_id;
	private String region;


    @Builder
    public ResumeRegionDTO(ResumeRegionVO entity) {
    	this.region_id = entity.getRegion_id();
    	this.r_id =entity.getR_id();
    	this.region = entity.getRegion();
    }
    
    
    public ResumeRegionVO toEntity() {
    	return ResumeRegionVO.builder()
    			.region_id(region_id)
    			.r_id(r_id)
    			.region(region)
    			.build();
    }
}

