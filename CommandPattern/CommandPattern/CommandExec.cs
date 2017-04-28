using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandPattern
{
    class CommandExec: ICommand
    {
        List<ICommand> commands = new List<ICommand>();
        ICommand command;
        public CommandExec(ICommand command)
        {
            this.command = command;
        }

        public void Do()
        {
            command.Do();
            commands.Add(command);
        }

        public void UnDo()
        {
            command.UnDo();
            commands.Remove(commands.First());
        }
    }
}
