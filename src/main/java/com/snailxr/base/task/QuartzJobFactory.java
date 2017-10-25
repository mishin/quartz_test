package com.snailxr.base.task;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.snailxr.base.task.domain.ScheduleJob;

/**
* @File    QuartzJobFactory.java
* @author  ShieldofZues
* @Date    create by 9:57  2017/10/23 0023
* @Description  计划任务执行处 无状态
* @Method
* @param
* @return
*
*/
public class QuartzJobFactory implements Job {
	public final Logger log = Logger.getLogger(this.getClass());

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
		TaskUtils.invokMethod(scheduleJob);
	}
}