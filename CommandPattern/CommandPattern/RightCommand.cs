using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandPattern
{
    class RightCommand : ICommand
    {
        public RightCommand()
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
