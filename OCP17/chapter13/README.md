# Notes on Java SE17 Concurrency Exam Topics
## Chapter 13
### Run Vs Start on threads: 
- run() can be called many times with a thread while start() can only be called once.
  - Note: run() acts like a normal method, and it does not start a new thread.
- Calling Shutdown() causes any new jobs submitted to throw RejectExececutionException.

