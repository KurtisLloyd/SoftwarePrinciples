using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandPattern
{
    class LeftCommand : ICommand
    {
        public LeftCommand()
        {

        }
        public void Do()
        {
            throw new NotImplementedException();
        }

        public void UnDo()
        {
            throw new NotImplementedException();
        }
    }
}
