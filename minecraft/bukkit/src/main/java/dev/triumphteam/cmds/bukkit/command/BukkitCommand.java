package dev.triumphteam.cmds.bukkit.command;

import dev.triumphteam.core.BaseCommand;
import dev.triumphteam.core.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class BukkitCommand extends org.bukkit.command.Command implements Command {

    private final String name;
    private final List<String> alias;

    public BukkitCommand(
            @NotNull final String name,
            @NotNull final List<String> alias
    ) {
        super(name);
        setAliases(alias);

        this.name = name;
        this.alias = alias;
    }

    @Override
    public boolean addSubCommands(final @NotNull BaseCommand baseCommand) {
        return false;
    }

    @Override
    public boolean execute(@NotNull final CommandSender sender, @NotNull final String commandLabel, @NotNull final String[] args) {
        return false;
    }

    @NotNull
    @Override
    public String getName() {
        return name;
    }


    @NotNull
    @Override
    public List<String> getAlias() {
        return alias;
    }

}
