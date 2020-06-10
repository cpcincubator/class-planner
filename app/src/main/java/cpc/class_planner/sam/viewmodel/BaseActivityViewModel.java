package cpc.class_planner.sam.viewmodel;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

import cpc.class_planner.sam.data.RoutineDao;
import cpc.class_planner.sam.data.RoutineDatabase;
import cpc.class_planner.sam.model.Routine;

public class BaseActivityViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    private RoutineDao routineDao;
    private RoutineDatabase database;

    // base constructor for android ViewModel
    public BaseActivityViewModel(@NonNull Application application) {
        super(application);
        database = RoutineDatabase.getInstance(application);
        routineDao = database.routineDao();
    }


    public List<Routine> getDailyRoutine(final String day){
       return routineDao.getTodayRoutine(day);
    }

}
