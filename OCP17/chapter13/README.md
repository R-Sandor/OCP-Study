# Notes on Java SE17 Concurrency Exam Topics
## Chapter 13
### Run Vs Start on threads: 
- run() can be called many times with a thread while start() can only be called once.
  - Note: run() acts like a normal method, and it does not start a new thread.
- Calling Shutdown() causes any new jobs submitted to throw RejectExececutionException.
### Submitting Tasks
- calling submit(Runnable task) returns a Future<V> that is null because the return type of the method is void.
### Scheduled with Fixed Delay
- The scheduleWithFixedDelay() ensures that there is a delay between when the first task is scheduled and subsequent tasks. 
  - Advanatage of this is that the queue does not get overfilled if the timeto complete the taks is longer than fixed rate used in scheduleAtFixedRate(). 
  - Disadvantage is this should not be used for tasks that should be completed at a given time as there is not a guarantee that it will be run at specified interval as with scheduleAtFixedRate(). 
  - Note: That scheduleAtFixedRate() doesn't necessarily guarantee this either as discussed that a task could take longer than the time alloted between tasks, thereby skewing the next start time. 
