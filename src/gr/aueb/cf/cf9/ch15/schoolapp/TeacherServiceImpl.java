package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService {

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Adding teacher: " + teacher);

    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Updating teacher: " + teacher);

    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Removing teacher with id: " + id);

    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "John", "Doe");
    }

    @Override
    public Teacher[] getAllTeachers() {
        Teacher[] teachers = {
                new Teacher(1L, "John", "Doe"),
                new Teacher(2L, "Jane", "Smith"),
                new Teacher(3L, "Bob", "Johnson"),
                new Teacher(4L, "Alice", "Williams")
        };

        return teachers;
    }







}
