package de.turing85.quarkus.picocli.subcommands;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.arc.Unremovable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;

@CommandLine.Command(name = "bar", mixinStandardHelpOptions = true)
@Unremovable
@ApplicationScoped
@RequiredArgsConstructor
@Slf4j
public class BarCommand implements Runnable {
  String name;

  @Override
  public void run() {
    log.info("Hello from Bar to {}!", name);
  }

  @CommandLine.Option(names = {"--name", "-n"}, required = true)
  @SuppressWarnings("unused")
  public void setName(String name) {
    this.name = name;
  }
}
