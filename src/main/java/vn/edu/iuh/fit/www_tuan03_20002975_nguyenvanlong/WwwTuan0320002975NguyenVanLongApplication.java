package vn.edu.iuh.fit.www_tuan03_20002975_nguyenvanlong;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_tuan03_20002975_nguyenvanlong.entities.Candidate;

@SpringBootApplication
public class WwwTuan0320002975NguyenVanLongApplication {

    public static void main(String[] args) {
        SpringApplication.run(WwwTuan0320002975NguyenVanLongApplication.class, args);
    }


    //	@Bean
//	public CommandLineRunner example01(){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Candidate candidate = new Candidate("long", "01234567", "TP HCM", "long@gmail.com");
//				if(classDao.insert(candidate)){
//					System.out.println("insertOk");
//				}
//
//			}
//		};
//	}
//	@Bean
//	public CommandLineRunner example02(){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Candidate candidate = new Candidate("cuong3", "01234567", "TP HCM", "Cuong@gmail.com");
//				if(classDao.update(candidate,3L)){
//					System.out.println("updateOK");
//				}
//
//			}
//		};
    @Bean
    public CommandLineRunner example04() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Candidate candidate = (Candidate) classDao.findById(3L);
                System.out.println("ID:" + candidate.getId());
                System.out.println(",Name:" + candidate.getName());
                System.out.println(",Address:" + candidate.getAddress());
                System.out.println(",Phone:" + candidate.getPhone());
                System.out.println(",Email:" + candidate.getEmail());
            }
        };
    }
}
//	}
