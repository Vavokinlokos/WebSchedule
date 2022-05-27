package schedule.web;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import schedule.dao.PairDao;
import schedule.dao.TeacherDao;
import schedule.models.BuzzerOnPair;
import schedule.models.Pair;
import schedule.models.Teacher;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleRestController {

    private PairDao pairDao;
    private TeacherDao teacherDao;

    public ScheduleRestController(PairDao pairDao, TeacherDao teacherDao) {
        this.pairDao = pairDao;
        this.teacherDao = teacherDao;
    }

    @RequestMapping(value = "pairs", method = RequestMethod.GET)
    public List<Pair> getAllPairs() {
        return pairDao.getAllPairs();
    }

    @RequestMapping(value = "teacher", method = RequestMethod.GET)
    public List<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }

    @RequestMapping(value = "teacher", method = RequestMethod.POST)
    public Teacher addNewTeacher(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @RequestMapping(value = "teacher", method = RequestMethod.DELETE)
    public boolean deleteTeacher(Long id) {
        try {
            teacherDao.delete(teacherDao.getTeacherById(id));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}