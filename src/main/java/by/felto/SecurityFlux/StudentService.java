package by.felto.SecurityFlux;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class StudentService {

    public Mono<Student> findStudentsById(long id) {
        return Mono.just(new Student());
    }

    public Flux<Student> findStudentsByName(String name) {
        return Flux.just(new Student());
    }

    public Mono<Student> findStudentById(long id) {
        return Mono.just(new Student());
    }

    public Mono<Student> addNewStudent(Student student) {
        return Mono.just(student);
    }

    public Mono<Student> updateStudent(long id, Student student) {
        return Mono.just(student);
    }

    public Mono<Void> deleteStudent(Student id) {
        return Mono.just(null);
    }


}
