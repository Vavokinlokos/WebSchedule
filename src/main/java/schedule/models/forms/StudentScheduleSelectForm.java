package schedule.models.forms;

import javax.validation.constraints.NotNull;

public class StudentScheduleSelectForm {
    @NotNull
    private Long selectedGroup;

    @NotNull
    private Long selectedSubgroup;

    @NotNull
    private Long selectedWeek;

    public StudentScheduleSelectForm() { }

    public StudentScheduleSelectForm(Long selectedGroup, Long selectedWeek) {
        this.selectedGroup = selectedGroup;
        this.selectedWeek = selectedWeek;
    }

    public Long getSelectedGroup() {
        return selectedGroup;
    }

    public void setSelectedSubgroup(Long selectedSubgroup) {
        this.selectedSubgroup = selectedSubgroup;
    }

    public Long getSelectedWeek() {
        return selectedWeek;
    }

    public void setSelectedWeek(Long selectedWeek) {
        this.selectedWeek = selectedWeek;
    }
}
