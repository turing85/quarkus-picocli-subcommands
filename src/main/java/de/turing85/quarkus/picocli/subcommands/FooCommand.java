package de.turing85.quarkus.picocli.subcommands;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;

@TopCommand
@CommandLine.Command(mixinStandardHelpOptions = true, helpCommand = true,
    subcommands = BarCommand.class)
@ApplicationScoped
@RequiredArgsConstructor
@Slf4j
public class FooCommand implements Runnable {
  @Override
  public void run() {
    log.info("Hello from foo!");
  }
}
