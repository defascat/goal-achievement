import org.defascat.goalachievement.AuthService;
import org.defascat.goalachievement.ServiceInjector;

AuthService authService = ServiceInjector.currentInjector.getInstance(AuthService)
println authService.isInitialized()