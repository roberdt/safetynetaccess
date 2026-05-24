package org.safetynetaccess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** Defines a controller to handle HTTP requests */
@Controller
public final class SafetyNetAccessController {

  private static String project;
  private static final Logger logger = LoggerFactory.getLogger(SafetyNetAccessController.class);

  /**
   * Create an endpoint for the landing page
   *
   * @return the index view template
   */
  @GetMapping("/")
  public String helloWorld(Model model) {

    // Get Cloud Run environment variables.
    String revision = System.getenv("K_REVISION") == null ? "???" : System.getenv("K_REVISION");
    String service = System.getenv("K_SERVICE") == null ? "???" : System.getenv("K_SERVICE");

    // Set variables in html template.
    model.addAttribute("revision", revision);
    model.addAttribute("service", service);
    model.addAttribute("title", "Safety Net Access");
    return "index";
  }

  @GetMapping("/about")
  public String about(Model model) {
    model.addAttribute("title", "SNA - About");
    return "about";
  }

  @GetMapping("/contactus")
  public String contactus(Model model) {
    model.addAttribute("title", "SNA - Contact Us");
    return "contactus";
  }

  @GetMapping("/privatepolicy")
  public String privatepolicy(Model model) {
    model.addAttribute("title", "SNA - Private Policy");
    return "privatepolicy";
  }

  @GetMapping("/currentprojects")
  public String currentprojects(Model model) {
    model.addAttribute("title", "SNA - Current Projects");
    return "currentprojects";
  }

  @GetMapping(value = "/ads.txt")
  public String adstext(Model model) {
    model.addAttribute("ads_text", "google.com, pub-9720580462190758, DIRECT, f08c47fec0942fa0");
    return "ads";
  }
}
