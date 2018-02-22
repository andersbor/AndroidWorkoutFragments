package com.anbo.workoutfragments;

/**
 * Head First, page 275
 * Created by anders on 2/24/2016.
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Losener", "5 Handstands push-ups\n10 1-legged squats\\n15 Pullups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Strength and Length", "500 meter run\n21 x 1.5 poot kettleball swing\n21 x pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


}
