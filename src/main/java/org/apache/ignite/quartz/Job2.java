package org.apache.ignite.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class Job2 implements Job {

    private static int count;



    public void execute(JobExecutionContext jobContext) throws JobExecutionException {

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Job2 start: " + jobContext.getFireTime());

        count++;

        System.out.println("Job count " + count);

        System.out.println("Job2 next scheduled time: " + jobContext.getNextFireTime());

        System.out.println("Job's thread name is: " + Thread.currentThread().getName());

        System.out.println("Job end");

        System.out.println("--------------------------------------------------------------------");

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }
}
