import grails.util.GrailsUtil;
import racetrack.Race;
import racetrack.Registration;
import racetrack.Runner;
import racetrack.User;

class BootStrap {

    def init = { servletContext ->
		switch(GrailsUtil.environment) {
			case "development":
				
				def admin = new User(login:"admin",
					                 password:"wordpass",
									 role:"admin")
				admin.save()
				if (admin.hasErrors()) {
					println admin.errors
				}
				
				def jdoe = new User(login:"jdoe", 
									password:"wordpass",
									role:"user")
				jdoe.save()
				if (jdoe.hasErrors()) {
					println jdoe.errors
				}

				break				
			case "production" : break
		}
    }
    def destroy = {
    }
	
	def createUser
}
