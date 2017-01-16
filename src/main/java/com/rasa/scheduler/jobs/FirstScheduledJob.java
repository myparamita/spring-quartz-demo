package com.rasa.scheduler.jobs;

import com.rasa.scheduler.util.AnotherBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Rasa LV
 */
public class FirstScheduledJob extends QuartzJobBean {
	
	private AnotherBean anotherBean;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("I am FirstScheduledJob");
		this.anotherBean.printAnotherMessage();

	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}
